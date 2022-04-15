package exercises;

//public class SplitString {
//    public static void main(String[] args) {
//        String str = "I would not, could not, in a box." +
//        "I would not, could not with a fox." +
//        "I will not eat them in a house." +
//        "I will not eat them with a mouse.";
//        String parts[] =str.split(" ");
//        for(String part: parts) {
//            System.out.println(part);
//        }
//    }
//}

    public class SplitString {
        public static void main(String[] args) {
            String str = "I would not, could not, in a box." +
                    "I would not, could not with a fox." +
                    "I will not eat them in a house." +
                    "I will not eat them with a mouse.";
            String parts[] = str.split("\\.");
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }
