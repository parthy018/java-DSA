package alpha.String;

public class StringCompression {
    public static StringBuilder compress(String sr) {
        StringBuilder sb = new StringBuilder(" ");
    for(int i=0;i<sr.length();i++){
        int count=1;
        while(sr.charAt(i)==sr.charAt(i+1) && i<sr.length()-1){
            count++;
            i++;
        }
        sb.append(sr.charAt(i));
        if(count>1){
            String c=String.valueOf(count);
            sb.append(c);
        }

    }

        return sb;
    }

    public static void main(String[] args) {
        String sr = "aaabbcccdd";
        StringBuilder ans=new StringBuilder(" ");
        ans=compress(sr);
        System.out.println(ans);
    }
}
