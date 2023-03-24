package alpha.Recursion;

public class backtrackarrayintro {
            public static void changearr(int arr[],int i,int val) {
                if (i == arr.length) {
                    print(arr);
                    return;
                }
                arr[i] = val;
                changearr(arr, i + 1, val + 1);
                arr[i] = arr[i] - 2;
            }
           /* public static String removeduplicate(String s){
                if(s.length()==0){
                    return "";
                }
                char ch=s.charAt(0);
                String ans=removeduplicate(s.substring(1));
                if(ch==ans.charAt(0)){
                    return ans;
                }
                return ch+ans;
            }*/

            public static void removedup(String str,int idx,StringBuilder sb,boolean map[]){
                if(idx==str.length()){
                    System.out.println(sb);
                    return;
                }
                char ch=str.charAt(idx);
                if(map[ch-'a']==true){
                    removedup(str,idx+1,sb,map);
                }else{
                    map[ch-'a']=true;
                    removedup(str,idx+1,sb.append(ch),map);
                }
            }

            //this function is for printing subsets of string
        public static void  findSubset(String str,String ans,int i){
                if(i==str.length()){
                    System.out.println(ans);
                    return;
                }
                // recursion
                //yes choice
                findSubset(str,ans+str.charAt(i),i+1);
                //no choice
                findSubset(str,ans,i+1);
        }

                public static void print(int arr[]){
                    for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                }


                public static void main(String []arg){
                    int arr[]=new int[5];
                    changearr(arr,0,1);
                    print(arr);
                    System.out.println();

                    //String s=removeduplicate("appnnacollege");
                  //  System.out.println(s);

                    boolean map[]=new boolean[25];
                    removedup("appnnacollege",0,new StringBuilder(),new boolean[26]);
                    System.out.println();
                    String str="abc";
                    findSubset(str,"",0);
                }
}
