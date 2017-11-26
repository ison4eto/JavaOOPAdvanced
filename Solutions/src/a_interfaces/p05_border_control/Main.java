    package a_interfaces.p05_border_control;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

    /**
     * Created by George-Lenovo on 6/29/2017.
     */
    public class Main {
        private static Scanner in = new Scanner(System.in);
        private static Map<String, Buyer> buyers = new HashMap<>();

        public static void main(String[] args) {
            setBuyers();
            buyFood();
        }

        private static void buyFood() {
            while (true) {
                String line = in.nextLine();
                if ("End".equals(line)) {
                    print();
                    break;
                }
                if (buyers.containsKey(line)) {
                    buyers.get(line).buyFood();
                }
            }
        }

        private static void setBuyers() {
            int n = Integer.parseInt(in.nextLine());
            for (int i = 0; i < n; i++) {
                writeData(in.nextLine().split("\\s+"));
            }
        }

        private static void print() {
            System.out.println(Citizen.getFood() + Rebel.food);
        }


        private static void writeData(String[] data) {
            Buyer buyer = null;
            switch (data.length) {
                case 4:
                    buyer = new Citizen(data[0],Integer.parseInt(data[1]), data[2], data[3] );
                    break;
                case 3:
                    buyer = new Rebel(data[0], Integer.parseInt(data[1]), data[2]);
                    break;
            }

            if (buyer != null) buyers.put(data[0], buyer);
        }
    }
    /*import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            List<String> map = new ArrayList<>();
            while (true){
                String[] tokens = reader.readLine().split("\\s+");
                if(tokens[0].equalsIgnoreCase("end")){
                    break;
                }
                switch (tokens[0]){
                    case "Citizen":
                        map.add(tokens[4]);
                        break;
                    case "Pet":
                        map.add(tokens[2]);
                        break;
                    case "Robot":
                        break;
                }
            }
            String fakeId = reader.readLine();
            map.stream()
            .filter(id->id.endsWith(fakeId))
            .forEach(System.out::println);
        }
    }*/
