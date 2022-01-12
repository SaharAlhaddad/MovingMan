
// Drawing lines, rectangles and ovals

// Java core packages
import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;

public class LinesRectsOvals4 extends JFrame implements Runnable {

   // set window's title bar String and dimensions

   Thread runner;

   public LinesRectsOvals4()
   {
      super( "Drawing lines, rectangles and ovals" );
      setSize( 600, 400 );
      show();
   }

   // display various lines, rectangles and ovals
   public void paint( Graphics g )
   {
      // call superclass's paint method
      super.paint( g );
    Color c = new Color(128,186,244);
     // se tbackground color
      g.setColor( Color.white );
    // g.setColor( c );
      g.fillRect( 0, 0, 600, 400 );

     // draw house
      drawhouse(g);
      pause(2000);
    // open door
      opendoor(g);
      pause(500);
     // Color c = new Color(187,131,104);

     //draw man
     drawman_frontSide( g,252,245,20,20);
   pause(1000);
   //move man outside the house
     moveManForward(g,262,245);
  // move man backward to the house
     moveManBackward(g,262+50,245+60);

  //close the door
     closedoor(g );

   }

/*
public void start() {
    if (runner == null) {
                  runner = new Thread(this);
                  runner.start();
                }
          }


public void stop() {
        if (runner != null) {
               runner.stop();
               runner = null;
           }
       }
*/
public void run() {
        runner = new Thread(this);
         }

/*********** Draw House*******/
void drawhouse(Graphics g){

  //ground
    Color c = new Color(228,215,201);
   g.setColor( c );
    g.fillRect( 0, 215, 600, 185 );

    c = new Color(0,186,186);
      g.setColor( c );
      g.fillOval( 50,200, 500, 180 );
      c = new Color(148,237,192);
      g.setColor( c );
      g.fillOval( 100,200, 400, 160 );
    //sky
     c = new Color(203,235,250);
     g.setColor( c );
    //g.fillRect( 0, 0, 600, 215 );
   //  «·”ﬁ›
      c = new Color(187,131,104);
      g.setColor( c);
      g.drawLine( 150, 150, 250, 50 );
      g.drawLine( 350, 150, 250, 50 );
      g.drawLine( 350, 50, 250, 50 );
      g.drawLine( 350, 50, 450, 150 );
// lines
      g.drawLine( 340, 50, 440, 150 );
      g.drawLine( 330, 50, 430, 150 );
      g.drawLine( 320, 50, 420, 150 );
      g.drawLine( 310, 50, 410, 150 );
      g.drawLine( 300, 50, 400, 150 );
      g.drawLine( 290, 50, 390, 150 );
      g.drawLine( 280, 50, 380, 150 );
      g.drawLine( 270, 50, 370, 150 );
      g.drawLine( 260, 50, 360, 150 );
    ///******wall
       c = new Color(250,253,204);
      g.setColor( c );
      g.fill3DRect( 150, 150, 200, 160,true );
      c = new Color(187,131,104);
       g.setColor( c);
      g.drawRect( 150, 150, 200, 160 );


  // circle
        c = new Color(187,131,104);
       g.setColor( c);
      g.fillOval( 240, 100, 20, 20 );

//*******window
     c = new Color(187,131,104);
     g.setColor( c);
     g.fill3DRect( 180, 180, 40, 40,true );
     g.fill3DRect( 280, 180, 40, 40 ,true);
      c = new Color(250,253,204);
      g.setColor( c);
     g.drawRect( 185, 185, 30, 30 );
     g.drawRect( 285, 185, 30, 30 );
     //************door
    c = new Color(187,131,104);
     g.setColor( c);
     g.fill3DRect( 220, 240, 60, 70,true );
      c = new Color(250,253,204);
      g.setColor( c );
     g.drawRect( 225, 245, 50, 60 );
   //****backside
     c = new Color(250,253,204);
      g.setColor( c );
      g.fill3DRect( 350, 150, 100, 160,true );

      c = new Color(187,131,104);
       g.setColor( c);
      g.drawRect( 350, 150, 100, 160 );


}
/************** Open door**************/
void  opendoor(Graphics g ){

      Color c = new Color(187,131,104);
int L=40;
 for ( int x=0;x<2;x++) {

        pause(1000);
        g.setColor( Color.lightGray );
       g.fillRect( 220, 240, 60, 70 );
       c = new Color(187,131,104);
       g.setColor( c );
       g.fillRect( 221, 241, L, 69 );
       c = new Color(250,253,204);
       g.setColor( c );
       g.drawRect( 225, 245, L-10, 60 );
       L-=20;
}

}
/************* Close door ***********/
void  closedoor(Graphics g ){

Color c = new Color(187,131,104);
int L=40;
 for ( int x=0;x<2;x++) {

        pause(1000);
        g.setColor( Color.lightGray );
       g.fillRect( 220, 240, 60, 70 );
       c = new Color(187,131,104);
       g.setColor( c );
       g.fillRect( 221, 241, L, 69 );
       c = new Color(250,253,204);
       g.setColor( c );
       g.drawRect( 225, 245, L-10, 60 );
       L+=20;
}
}


void drawman_frontSide(Graphics g,int x,int y,int leg1,int leg2){
int xFase=x;
int yFase=y;
int xHand=xFase-5;
int yHand=yFase+16;
int xLeg=xFase+1;
int yLeg=yFase+37;
int legLong1= leg1;
int legLong2= leg2;
    Color c = new Color(244,230,208);
    g.setColor( c);
   //fase
    g.fillOval( xFase, yFase, 15, 15 );
  //hair
   g.setColor(Color.black);
   g.fillRoundRect( xFase-1, yFase, 16, 3,5,2 );
  //e
  g.setColor(Color.black);
   g.fillOval( xFase+2, yFase+5, 3, 3 );
   g.fillOval( xFase+10, yFase+5, 3, 3 );
// mouth
  g.drawLine( xFase+5, yFase+11,xFase+9 , yFase+11 );
 //body
    c = new Color(240,125,157);
     g.setColor( c);
    g.fillRoundRect( xFase-1, yFase+14,18, 20,4,4 );
    g.setColor( Color.black);
    g.fillRoundRect( xFase+1, yFase+32, 13, 4,4,4 );
      g.setColor( Color.black);

    g.drawRoundRect( xFase+1, yFase+32, 13, 4,4,4 );


    //hands

   c = new Color(244,230,208);
   g.setColor( c);
    g.fillRoundRect(  xHand,yHand,2, 14,1,1 );
    g.fillRoundRect( xHand+23, yHand, 2, 14,1,1 );
    // «·«ÌœÌ
    g.fillOval( xHand-1, yHand+12, 4, 6 );
    g.fillOval( xHand+22, yHand+12, 4, 6 );
    c = new Color(240,125,157);
     g.setColor( c);
// «·ﬂ ›
    g.fillRoundRect( xHand-1, yFase+14, 27, 5,4,4 );



     //legs
     g.setColor( Color.blue);
     g.fillRect( xLeg, yLeg, 5, legLong1);
     g.fillRect( xLeg+8, yLeg, 5, legLong2);


    // black line
    g.setColor( Color.black);
    g.drawRect( xLeg, yLeg, 5, legLong1);
     g.drawRect( xLeg+8, yLeg, 5, legLong2 );

   //body+legs
   g.setColor( Color.blue);
  // g.fillRect( xFase-1, yFase+35, 18, 5 );
   g.fillRoundRect( xFase-1, yFase+35, 18, 4,3,3 );


   //foot
     g.setColor( Color.black);
     g.fillOval( xLeg+1, yLeg+legLong1-1, 4, 6 );
     g.fillOval( xLeg+9, yLeg+legLong2-1, 4, 6 );



}
void drawman_backSide(Graphics g,int x,int y,int leg1,int leg2){
int xFase=x;
int yFase=y;
int xHand=xFase-5;
int yHand=yFase+16;
int xLeg=xFase+1;
int yLeg=yFase+37;
int legLong1= leg1;
int legLong2= leg2;
    Color c = new Color(244,230,208);
    g.setColor( c);
   //fase
    g.fillOval( xFase, yFase, 15, 15 );
  //hair
   g.setColor(Color.black);
   g.fillRoundRect( xFase-1, yFase, 16, 3,5,2 );

 //body
    c = new Color(240,125,157);
     g.setColor( c);
    g.fillRoundRect( xFase-1, yFase+14,18, 20,4,4 );
    g.setColor( Color.black);
    g.fillRoundRect( xFase+1, yFase+32, 13, 4,4,4 );
    g.setColor( Color.black);
   g.drawRoundRect( xFase+1, yFase+32, 13, 4,4,4 );


    //hands

   c = new Color(244,230,208);
   g.setColor( c);
    g.fillRoundRect(  xHand,yHand,2, 14,1,1 );
    g.fillRoundRect( xHand+23, yHand, 2, 14,1,1 );
    // «·«ÌœÌ
    g.fillOval( xHand-1, yHand+12, 4, 6 );
    g.fillOval( xHand+22, yHand+12, 4, 6 );
    c = new Color(240,125,157);
     g.setColor( c);
// «·ﬂ ›
    g.fillRoundRect( xHand-1, yFase+14, 27, 5,4,4 );



     //legs
     g.setColor( Color.blue);
     g.fillRect( xLeg, yLeg, 5, legLong1);
     g.fillRect( xLeg+8, yLeg, 5, legLong2);


    // black line
    g.setColor( Color.black);
    g.drawRect( xLeg, yLeg, 5, legLong1);
     g.drawRect( xLeg+8, yLeg, 5, legLong2 );

   //body+legs
   g.setColor( Color.blue);

   g.fillRoundRect( xFase-1, yFase+35, 18, 4,3,3 );


   //foot
     g.setColor( Color.black);
     g.fillOval( xLeg+1, yLeg+legLong1-1, 4, 6 );
     g.fillOval( xLeg+9, yLeg+legLong2-1, 4, 6 );


}

void moveManForward(Graphics g,int start,int end) {

Color c = new Color(187,131,104);
     g.setColor( c);
int L1=20;
int L2=16;
int i,k=0;
for ( i = start; i < start+60; i +=10)
   {
                 clearbackground1(g);
                 end+=10;
                 if ( k%2==0) {

                                drawman_frontSide( g,i,end,L1,L2);
     	               pause(1000);
                       }
                  else
                  {
                              drawman_frontSide( g,i,end,L2,L1);
     	             pause(1000);
                     }
                  ++k;
              }
clearbackground1(g);
drawman_frontSide( g,i-10,end,20,20);
pause(1000);
}

void moveManBackward(Graphics g,int start,int end) {

Color c = new Color(187,131,104);
     g.setColor( c);
int L1=20;
int L2=16;
int i,k=0;
for ( i = start-10; i > start-70; i -=10)
   {
                 clearbackground2(g);
                  end-=10;
                 if ( k%2==0) {

                                drawman_backSide( g,i,end,L1,L2);
     	               pause(100);
                       }
                  else
                  {
                              drawman_backSide( g,i,end,L2,L1);
     	             pause(100);
                     }
                  ++k;
              }
 clearbackground2(g);
drawman_backSide( g,i+10,end,20,20);
}

void clearbackground1(Graphics g){
      Color c = new Color(187,131,104);
      g.setColor( Color.white );
      g.fillRect( 0, 0, 600, 400 );
      drawhouse(g);
      g.setColor( Color.lightGray );
      g.fillRect( 220, 240, 60, 70 );
      g.setColor( c );
      g.fillRect( 221, 241, 20, 69);
      c = new Color(250,253,204);
      g.setColor( c );
      g.drawRect( 225, 245, 10, 60 );
       }
void clearbackground2(Graphics g){
      Color c = new Color(187,131,104);
      g.setColor( Color.white );
      g.fillRect( 0, 0, 600, 400 );
      drawhouse(g);
      g.setColor( Color.lightGray );
      g.fillRect( 220, 240, 60, 70 );
      g.setColor( c );
      g.fillRect( 221, 241, 20, 69);
      c = new Color(250,253,204);
       g.setColor( c );
       g.drawRect( 225, 245, 10, 60 );
       }

 void pause(int time) {

     try { Thread.sleep(time); }

     catch (InterruptedException e) { }

        }


 // execute application
   public static void main( String args[] )
   {
      LinesRectsOvals4 application = new LinesRectsOvals4();
      application.setDefaultCloseOperation(
       JFrame.EXIT_ON_CLOSE );
   }

}  // end class LinesRectsOvals


