package dspracticeproblems;

public class DecodeAndEncode {

    public static void main(String[] args) {
        System.out.println(encodeString("RRRRRW"));
    }

    public static String decodeString(String str){
        int i =0,j=1;
        var length = str.length();
        String outPut ="";
        while (j<length){
            int k=0;
            char a = str.charAt(i);
            while(j<length && str.charAt(j)<'9'){
                j++;
            }
            Integer count = Integer.parseInt(str.substring(i+1,j));
            for(var l=0;l<count;l++){
                outPut = outPut + a;
            }
            i=j;
            j++;


        }
        return outPut;
    }

    public static String encodeString(String str){
        int i =0,j=1;
        var length = str.length();
        String outPut ="";
        char firstChar = str.charAt(0);
        int count = 0,logicalCount =0;
        for(char c : str.toCharArray()){
            if(c==firstChar){
                logicalCount ++;
            }else {
                outPut =outPut+ firstChar +""+logicalCount;
                firstChar = c;
                logicalCount=1;
            }
            count++;
        }
        if(count==length){
            outPut = outPut+ firstChar +""+logicalCount;
        }
        return outPut;
    }
}
