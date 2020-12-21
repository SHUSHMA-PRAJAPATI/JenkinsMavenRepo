public class SampleJenkinsProject
{
 public static void main(String[] args)
 {
  SampleJenkinsProject sjp = new SampleJenkinsProject();
 
  String result = sjp.getData();
  System.out.println("Result is :"+result);
  System.out.println("Welcome To Jenkins");
 }
 public String getData()
 {
  return "Hello World";
 }
}