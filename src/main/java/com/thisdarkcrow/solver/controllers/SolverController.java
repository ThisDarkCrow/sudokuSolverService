package com.thisdarkcrow.solver.controllers;

import org.apache.el.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thisdarkcrow.solver.services.SolverService;

@RestController
@RequestMapping("/sudoku")
public class SolverController {

    @Autowired
    SolverService solverService;

    @GetMapping
    public int[][] getTestResponse(){
        return this.solverService.getTestResponse();
    }

    @GetMapping(path="/{solve}")
    public int[][] getFirstSolution(@RequestParam String initialState) throws ParseException{
        return this.solverService.getFirstSolution(initialState);
    }

    @PostMapping
    public int[][] setSolve(@RequestBody int[][]state) throws ParseException{
        return this.solverService.getFirstSolution(state);
    }
    
}
