public class MainPatient{
    public static void main(String[] arg){
        Random  r = new Random();
        Scanner s=new Scanner(System.in);
        Patient[] pat = new Patient[3];
        for(int i=0;i<pat.length;i++){
            pat[i] = new Patient(s.next(),s.next(),s.next(),s.nextInt(),s.nextInt(),s.nextInt());

        }
        for(int i=0;i<pat.length;i++){
            System.out.println(pat[i].getName() + " " pat[i].getLastName()+": " + pat[i].price()+"lari")
        }
    }
}