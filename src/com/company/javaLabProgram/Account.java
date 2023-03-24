package javaLabProgram;
class AccountDetail {
    private long accountNO;
    private String name,email;
    private float amount;

    public void setAccountNo(long acc_no){
        this.accountNO=acc_no;
    }
    public long getAccountno(){
        return accountNO;
    }

    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }

    public void setEmail(String e){
        this.email=e;
    }
    public String getEmail(){
        return email;
    }

    public void setAmount(float f){
        this.amount=f;
    }
    public float getAmount(){
        return amount;
    }
}

public class Account{
    public static void main(String []args){
        AccountDetail account=new AccountDetail();
        account.setAccountNo(545465435);
        account.setName("jerry");
        account.setEmail("jerry@123gmail.com");
        account.setAmount(654555);

        account.getAccountno();
       String a= account.getName();
       System.out.println(a);
    }
}


