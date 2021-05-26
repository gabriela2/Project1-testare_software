package pachet1;


import java.util.ArrayList;

public class MyClass {
    public static String find(Integer N, ArrayList<Integer> results) {
        ArrayList<Integer> finalResults = new ArrayList<>();


        if(N>100000 || N< 4){
            System.out.println("N trebuie sa aiba o valoare din intervalul [4; 100 000]");
            return "N trebuie sa aiba o valoare din intervalul [4; 100 000]";
        }
        for (Integer i=0;i< N;i++){
            if(results.get(i) > 1000000000 || results.get(i)<-1000000000){
                System.out.println("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]");
                return "Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]";
            }
        }


        if (N % 4 == 0) {
            finalResults.add(-1);
            System.out.println("[-1]");
            return String.valueOf(finalResults);
        } else {
            if (N % 4 == 1) {
                Integer sum = 0;
                int rez[] = new int[N];
                for (Integer i = 0; i < N; i++) {
                    if ((i + 1) % 4 == 1) {
                        sum += results.get(i);
                    }
                    if ((i + 1) % 4 == 2) {
                        sum += results.get(i);
                    }
                    if ((i + 1) % 4 == 3) {
                        sum -= results.get(i);
                    }
                    if ((i + 1) % 4 == 0) {
                        sum -= results.get(i);
                    }
                }
                rez[0] = (sum / 2);
                for (Integer i = 2; i < N; i += 2) {
                    rez[i] = results.get(i - 1) - rez[i - 2];
                }
                rez[1] = results.get(0) - rez[N - 1];
                for (Integer i = 3; i < N; i += 2) {
                    rez[i] = results.get(i - 1) - rez[i - 2];
                }
                for (Integer i = 0; i < N; i++) {
                    finalResults.add(rez[i]);
                }

                System.out.println("final results are:" + finalResults);
            }
            else if (N % 4 == 2) {
                Integer sum = 0;
                int rez[] = new int[N];
                for (Integer i = 1; i < N; i += 2) {
                    if ((i + 1) % 4 == 2) {
                        sum += results.get(i);
                    } else {
                        sum -= results.get(i);
                    }
                }

                rez[0] = (sum / 2);

                for (Integer i = 2; i < N; i += 2) {
                    rez[i] = results.get(i - 1) - rez[i - 2];
                }
                sum = results.get(0);
                for (Integer i = 2; i < N; i += 2) {
                    if ((i + 1) % 4 == 3) {
                        sum += results.get(i);
                    } else {
                        sum -= results.get(i);
                    }
                }
                rez[1] = sum / 2;
                for (Integer i = 3; i < N; i += 2) {
                    rez[i] = results.get(i - 1) - rez[i - 2];
                }
                for (Integer i = 0; i < N; i++) {
                    finalResults.add(rez[i]);
                }

                System.out.println("final results are:" + finalResults);
            }
            else if (N % 4 == 3) {
                Integer sum = 0;
                int rez[] = new int[N];
                for (Integer i = 0; i < N; i++) {
                    if ((i + 1) % 4 == 2) {
                        sum += results.get(i);
                    }
                    if ((i + 1) % 4 == 3) {
                        sum += results.get(i);
                    }
                    if ((i + 1) % 4 == 0) {
                        sum -= results.get(i);
                    }
                    if ((i + 1) % 4 == 1) {
                        sum -= results.get(i);
                    }
                }
                rez[0] = (sum / 2);
                for (Integer i = 2; i < N; i++) {
                    rez[i] = results.get(i - 1) - rez[i - 2];
                }

                rez[1] = results.get(0) - rez[N - 1];
                for (Integer i = 3; i < N; i += 2) {
                    rez[i] = results.get(i - 1) - rez[i - 2];
                }
                for (Integer i = 0; i < N; i++) {
                    finalResults.add(rez[i]);
                }

                System.out.println("final results are:" + finalResults);
            }


        }
        return String.valueOf(finalResults);
    }
}
