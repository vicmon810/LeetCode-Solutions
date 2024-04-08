package easy_solutions;

public  class leetcode151 {
    public static void main(String[] args) {
        String test1 = "the sky is blue";
        String test2 = "  hello world  ";
        String test3 = "a good   example";
        System.out.println(reverseWords(test1));
        System.out.println(reverseWords(test2));
        System.out.println(reverseWords(test3));


    }

   
        public static String reverseWords(String s) {
            //spliting input to split words
            String[] split = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            int i = split.length-1;
    
            while(i >= 0){
                if(split[i] != " "){
                // System.out.println(split[i]);
                sb.append(split[i]);
                if(i != 0 ) sb.append(' ');
                }else continue ;
                i--;
            }
            return sb.toString();
        }
    }
