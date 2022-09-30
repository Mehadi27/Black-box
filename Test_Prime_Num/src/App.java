import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPrime {
    
    @Test
   public void testCase01 () {

        new App();
        assertEquals(App.isPrime(3), true);
    }
    @Test
    public void testCase02 () {
 
         assertEquals(App.isPrime(0), false);
     }
     @Test
     public void testCase03 () {
  
          assertEquals(App.isPrime(-1), false);
      }
      @Test
      public void testCase04 () {
   
           new App();
           assertEquals(App.isPrime(10), false);
       }
       @Test
       public void testCase05 () {
    
            assertEquals(App.isPrime(11), true);
        }
        @Test
        public void testCase06 () {
     
             new App();
             assertEquals(App.isPrime(9), false);
         }
         @Test
         public void testCase07 () {
      
              new App();
              assertEquals(App.isPrime(1), false);
          }
}
