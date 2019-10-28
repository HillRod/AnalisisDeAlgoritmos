/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KnightsTourProblem;

/**
 *
 * @author abam_
 */
public class ChessBoard {
    Square[][] chessbor;
    //Posición actual del caballo
    int x,y,promx,promy;

    public ChessBoard(int dim) {
        chessbor = new Square[dim][dim];
        for (int i = 0; i < chessbor.length; i++) {
            for (int j = 0; j < chessbor.length; j++) {
                chessbor[i][j] =new Square();
            }
        }
    }
    
    public void SolveProblem(int xx, int yy){
        //Se establece la posición inicial del caballo
        this.x=xx;
        this.y=yy;
        int maxMov=5000;
        chessbor[x][y].visited=true;
        Recorrido:for (int i = 1; i <= chessbor.length*chessbor.length; i++) {
            if(((x-1>-1&&y-2>-1)&&chessbor[x-1][y-2].visited==false)&&CalcularMaxMov(this.x-1, this.y-2)<maxMov){maxMov=CalcularMaxMov(this.x-1, this.y-2);promx=this.x-1;promy=this.y-2;}
            if(((x-2>-1&&y-1>-1)&&chessbor[x-2][y-1].visited==false)&&CalcularMaxMov(this.x-2, this.y-1)<maxMov){maxMov=CalcularMaxMov(this.x-2, this.y-1);promx=this.x-2;promy=this.y-1;}
            if(((y+1<chessbor.length&&x-2>-1)&&chessbor[x-2][y+1].visited==false)&&CalcularMaxMov(this.x-2, this.y+1)<maxMov){maxMov=CalcularMaxMov(this.x-2, this.y+1);promx=this.x-2;promy=this.y+1;}
            if(((y+2<chessbor.length&&x-1>-1)&&chessbor[x-1][y+2].visited==false)&&CalcularMaxMov(this.x-1, this.y+2)<maxMov){maxMov=CalcularMaxMov(this.x-1, this.y+2);promx=this.x-1;promy=this.y+2;}
            if(((y+2<chessbor.length&&x+1<chessbor.length)&&chessbor[x+1][y+2].visited==false)&&CalcularMaxMov(this.x+1, this.y+2)<maxMov){maxMov=CalcularMaxMov(this.x+1, this.y+2);promx=this.x+1;promy=this.y+2;}
            if(((y+1<chessbor.length&&x+2<chessbor.length)&&chessbor[x+2][y+1].visited==false)&&CalcularMaxMov(this.x+2, this.y+1)<maxMov){maxMov=CalcularMaxMov(this.x+2, this.y+1);promx=this.x+2;promy=this.y+1;}
            if(((x+2<chessbor.length&&y-1>-1)&&chessbor[x+2][y-1].visited==false)&&CalcularMaxMov(this.x+2, this.y-1)<maxMov){maxMov=CalcularMaxMov(this.x+2, this.y-1);promx=this.x+2;promy=this.y-1;}
            if(((x+1<chessbor.length&&y-2>-1)&&chessbor[x+1][y-2].visited==false)&&CalcularMaxMov(this.x+1, this.y-2)<maxMov){maxMov=CalcularMaxMov(this.x+1, this.y-2);promx=this.x+1;promy=this.y-2;}
            
            if(chessbor[this.x][this.y].steep==0)chessbor[this.x][this.y].steep=i;
            this.x=promx;
            this.y=promy;
                chessbor[this.x][this.y].visited=true;
            maxMov=50000;
            
        }
    }
    
    public void PrintChessBoard(){
        for (int i = 0; i < chessbor.length; i++) {
            for (int j = 0; j < chessbor.length; j++) {
                if(chessbor[i][j].steep<10)System.out.print(" ");
                if(chessbor[i][j].steep<100)System.out.print(" ");
                if(chessbor[i][j].steep<1000)System.out.print(" ");
                System.out.print(chessbor[i][j].steep+" ");
            }
            System.out.println("");
        }
    }
    
    public int CalcularMaxMov(int x, int y){
        int movs=0;
            if((x-1>-1&&y-2>-1)&&chessbor[x-1][y-2].visited==false)movs++;
            if((x-2>-1&&y-1>-1)&&chessbor[x-2][y-1].visited==false)movs++;
            if((x+1<chessbor.length&&y-2>-1)&&chessbor[x+1][y-2].visited==false)movs++;
            if((x+2<chessbor.length&&y-1>-1)&&chessbor[x+2][y-1].visited==false)movs++;
            if((y+2<chessbor.length&&x+1<chessbor.length)&&chessbor[x+1][y+2].visited==false)movs++;
            if((y+1<chessbor.length&&x+2<chessbor.length)&&chessbor[x+2][y+1].visited==false)movs++;
            if((y+1<chessbor.length&&x-2>-1)&&chessbor[x-2][y+1].visited==false)movs++;
            if((y+2<chessbor.length&&x-1>-1)&&chessbor[x-1][y+2].visited==false)movs++;
            //System.out.println("");      
        return movs;
    }
    
}
