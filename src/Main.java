
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] rack = new int[4];
        rack[0] = 12;
        rack[1] = 9;
        rack[2] = 11;
        rack[3] = 10;

        int[] rack2 = new int[4];
        rack2[0] = 12;
        rack2[1] = 9;
        rack2[2] = 11;
        rack2[3] = 10;

        boolean rackAreEqual = true;

        for (int i = 0; i < rack.length; i++) {
            if (rack[i] != rack2[i]) {
                rackAreEqual = false;
                break;
            }
        }
        if (rackAreEqual) {
                System.out.println("Стелажи одинаковые");
            } else {
                System.out.println("Стелажи разные");
            }

        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++){
            System.out.println(weights[i + 1] - weights[i]);
        }

        }
    }
