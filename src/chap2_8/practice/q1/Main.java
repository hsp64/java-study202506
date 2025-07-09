package chap2_8.practice.q1;

import javax.xml.namespace.QName;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>

        transactions.stream()
                .filter(t -> t.getYear() == 2021)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("===================");

        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>

        transactions.stream()
                .map(m -> m.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("===================");

        // 연습 3: Cambridge에 근무하는 모든 거래자(Trader)를 찾아
        // 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(m -> m.getTrader())
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("===================");

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서
        // 알파벳순으로  오름차정렬하여 반환
        List<String> allTrader = transactions.stream()
                .map(t -> t.getTrader().getName())
                .sorted()
                .collect(toList());
        System.out.println("allTrader = " + allTrader);


        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean inMilan = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println("inMilan = " + inMilan);

        System.out.println("===================");


        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int valueaAllCambridge = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println("valueaAllCambridge = " + valueaAllCambridge);

        System.out.println("===================");

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?

        int allValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println("allValue = " + allValue);

        System.out.println("===================");

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        OptionalInt minValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min();
        System.out.println("minValue = " + minValue);
        System.out.println("===================");


        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고,
        // 해당 거래의 정보를 출력하시오.
        List<Integer> highValue = transactions.stream()
                .filter(t -> t.getValue() >= 500)
                .map(m -> m.getValue())
                .sorted()
                .collect(toList());
        System.out.println("highValue = " + highValue);


        // 연습 10. 모든 거래에서 가장 작은 거래액보다
        // 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        double avgValue = transactions.stream()
                .mapToDouble(m -> m.getValue())
                .sorted()
                .skip(1)
                .average()
                .getAsDouble();
        System.out.println("avgValue = " + avgValue);

        System.out.println("===================");

        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래정보들을 연도별로 그룹화하여 출력하시오.

        List<Transaction> groupCamb = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .collect(toList());

        List<Transaction> twoThousandTwentyOne = groupCamb.stream()
                .filter(t -> t.getYear() == 2021)
                .collect(toList());

        List<Transaction> twoThousandTwentyTwo = groupCamb.stream()
                .filter(t -> t.getYear() == 2022)
                .collect(toList());

        Map<Integer, List<Transaction>> tx = new HashMap<>();
        tx.put(2021, twoThousandTwentyOne);
        tx.put(2022, twoThousandTwentyTwo);

        tx.forEach( (k,v) -> {
            System.out.println("Year: " + k);
            for (Transaction t : v) {
                System.out.printf("{Trader: %s in %s year:%s value:%s} \n", t.getTrader().getName(), t.getTrader().getCity(), t.getYear(), t.getValue());

            }
        } );





        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}

                const data = {
                    2021: [
                        {
                            trader: {
                                city: '',
                                name: ''
                            },
                            year: 2021,
                            value: 300
                        },
                        {}
                    ],
                    2022: []
                }
         */


        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700

/*        List<Integer> collectValue = transactions.stream()
                .map(Transaction::getValue)
                .sorted()
                .collect(toList());

        System.out.println("collectValue = " + collectValue);

        System.out.println(collectValue.get(collectValue.size() - 1) - collectValue.get(0) );*/

    }

}