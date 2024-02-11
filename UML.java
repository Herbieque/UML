import Package1.Alpha; 
import Package2.Beta;
import Package3.Gamma;
import Package4.Delta; 
public class UML {
    static final int one = 1;
    static final int two = 2;
    static final int three = 3;
    static final int four = 4;
    static final int five = 5;
     void Override(){
        System.out.println("Test");
    }
   public class A extends UML implements One{
    public void methodOne(){
    }
    public int a;
    private int a2;
    protected int a3;
   
    void Override(){
        System.out.println("Test1");
    }
    public int sum(int x, int y){ 
        return (x + y); 
    }
    public int sum(int x, int y, int z){
        return (x+y+z); 
    }
    A(){
        System.out.println("Constructor");
    }
    A(int num){
         num = one + two; 
    }
    }

   public class B extends UML implements One{
    public void methodOne(){
    }
    public int b;
    private int b2;
    protected int b3;
    void Override(){
        System.out.println("Test2");
    }
    public int sum(int x, int y){ 
        return (x + y); 
    }
    public int sum(int x, int y, int z){
        return (x+y+z); 
    }
    B(){
        System.out.println("Constructor");
    }
    B(int num){
         num = one + two; 
    }
    }
   public class C extends UML implements Two{
    public void methodTwo(){
    }
    public int c;
    private int c2;
    protected int c3;
    void Override(){
        System.out.println("Test3");
    }
    public int sum(int x, int y){ 
        return (x + y); 
    }
    public int sum(int x, int y, int z){
        return (x+y+z); 
    }
    C(){
        System.out.println("Constructor");
    }
    C(int num){
         num = one + two; 
    }
    }

   public class D implements Two{
    public void methodTwo(){
    }
    public int d;
    private int d2;
    protected int d3;
    public int sum(int x, int y){ 
        return (x + y); 
    }
    public int sum(int x, int y, int z){
        return (x+y+z); 
    }
    D(){
        System.out.println("Constructor");
    }
    D(int num){
         num = one + two; 
    }
    }
   public class E {
    public int e;
    private int e2;
    protected int e3;
    public int sum(int x, int y){ 
        return (x + y); 
    }
    public int sum(int x, int y, int z){
        return (x+y+z); 
    }
    E(){
        System.out.println("Constructor");
    }
    E(int num){
         num = one + two; 
    }
 
    }
   private class F extends UML{
    public int f;
    private int f2;
    protected int f3;
    void Override(){
        System.out.println("Test6");
    }
    public int sum(int x, int y){ 
        return (x + y); 
    }
    public int sum(int x, int y, int z){
        return (x+y+z); 
    }
    F(){
        System.out.println("Constructor");
    }
    F(int num){
         num = one + two; 
    }
    }
   private class G extends UML{
    public int g;
    private int g2;
    protected int g3;
    void Override(){
        System.out.println("Test7");
    }
    public int sum(int x, int y){ 
        return (x + y); 
    }
    public int sum(int x, int y, int z){
        return (x+y+z); 
    }
    G(){
        System.out.println("Constructor");
    }
    G(int num){
         num = one + two; 
    }
    }
   private class H implements One{
    public void methodOne(){
    }
    public int h;
    private int h2;
    protected int h3;
    public int sum(int x, int y){ 
        return (x + y); 
    }
    public int sum(int x, int y, int z){
        return (x+y+z); 
    }
    H(){
        System.out.println("Constructor");
    }
    H(int num){
         num = one + two; 
    }
    }
    abstract class I {
    public int i;
    private int i2;        
    protected int i3;
    public abstract void emptyMethod();
    public abstract void emptyMethod2();
    public int sum(int x, int y){ 
        return (x + y); 
    }
    public int sum(int x, int y, int z){
        return (x+y+z); 
    }
    I(){
        System.out.println("Constructor");
    }
    I(int num){
         num = one + two; 
    }
    }
   abstract class J { 
    public int j;
    private int j2;
    protected int j3;
    public abstract void blankMethod();
    public abstract void blankMethod2();
    public int sum(int x, int y){ 
        return (x + y); 
    }
    public int sum(int x, int y, int z){
        return (x+y+z); 
    }
    J(){
        System.out.println("Constructor");
    }
    J(int num){
         num = one + two; 
    }
    }

     interface One {
    public void methodOne(); 
        
    }

    interface Two {
    public void methodTwo();

    }
    
}
