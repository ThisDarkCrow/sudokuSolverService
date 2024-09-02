package com.thisdarkcrow.solver.services;

import java.util.Stack;

import org.apache.el.parser.ParseException;
import org.springframework.stereotype.Service;

import com.thisdarkcrow.solver.algorithms.sudokusolver.SudokuAlgorithm;

@Service
public class SolverService {

    public int[][] getTestResponse(){
        int length;
        int[][]testResponse;

        length=9;
        testResponse=new int[length][length];

        for(int x=0;x<length;++x){
            for(int y=0;y<length;++y){
                testResponse[x][y]=x*length+y;
            }
        }

        return testResponse;
    }

    public int[][] getArray(){
        int[][] sudo=new int[9][9];
        for(int x=0;x<9;++x){
            for(int y=0;y<9;++y){
                sudo[x][y]=0;
            }
        }
        return sudo;
    }

    public int[][] getArraySpecial(String param){
        int targetValue;
        try {
            targetValue=Integer.parseInt(param);
        } catch (Exception e) {
            targetValue=9;
        }
        int[][] sudo=new int[9][9];
        for(int x=0;x<9;++x){
            for(int y=0;y<9;++y){
                sudo[x][y]=targetValue;
            }
        }
        return sudo;
    }

    public int[][] getFirstSolution(String param) throws ParseException{
        byte[][] sudokuByte=new byte[9][9];
        int[][] sudokuInt=new int[9][9];
        Stack<byte[][]> soluciones;

        for(int x=0;x<9;++x){
            for(int y=0;y<9;++y){
                sudokuInt[x][y]=0;
            }
        }

        if(param.length()==81){
            try {
                for(int x=0;x<9;++x){
                    for(int y=0;y<9;++y){
                        sudokuByte[x][y]=Byte.parseByte(""+param.charAt(x*9+y));
                    }
                }

                soluciones = SudokuAlgorithm.getSolutions(sudokuByte);

                for(int x=0;x<9;++x){
                    for(int y=0;y<9;++y){
                        sudokuInt[x][y]=Integer.parseInt(""+soluciones.elementAt(0)[x][y]);
                    }
                }
            } catch (IllegalArgumentException iae) {
                return sudokuInt;
            }
        }

        return sudokuInt;
    }

    public int[][] getFirstSolution(int[][]state) throws ParseException{
        byte[][] sudokuByte=new byte[9][9];
        int[][] sudokuInt=new int[9][9];
        Stack<byte[][]> soluciones;

        for(int x=0;x<9;++x){
            for(int y=0;y<9;++y){
                sudokuInt[x][y]=0;
            }
        }

        if(state.length==9){
            try {
                for(int x=0;x<9;++x){
                    for(int y=0;y<9;++y){
                        sudokuByte[x][y]=Byte.parseByte(""+state[x][y]);
                    }
                }

                soluciones = SudokuAlgorithm.getSolutions(sudokuByte);

                for(int x=0;x<9;++x){
                    for(int y=0;y<9;++y){
                        sudokuInt[x][y]=Integer.parseInt(""+soluciones.elementAt(0)[x][y]);
                    }
                }
            } catch (IllegalArgumentException iae) {
                return state;
            }
        }

        return sudokuInt;
    }

    public String setSolve(String initialState){
        return initialState+" solved at "+System.currentTimeMillis()/(1000*60*60);
    }
    
}
