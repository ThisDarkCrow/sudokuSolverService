<h1>About sudokuSolverService.</h1>
  <p>
    sudokuSolverService can process applications in array format, which are initially intended to 
    represent an initial state of the mathematical game Sudoku, but after processing, a solution to 
    the initial case will be obtained.
  </p>
  <p>
    The application expects the value 0 (zero) in the cells where it should compute the value.
  </p>
<h1>Input.</h1>
  <p>
    In localhost, via POST method, you must send a request to the following URL (Using the default 
    port 8080):
  </p>
  <href>
    http://localhost:8080/sudoku
  </href>
  <p>
    <br>The request must have the following format:
  </p>
  <p>
    [
    <br>[7,0,5,0,0,8,9,0,0],
    <br>[0,0,0,5,9,0,7,8,0],
    <br>[0,0,0,4,2,7,0,0,0],
    <br>[1,3,0,8,0,0,2,7,9],
    <br>[2,8,7,0,0,0,5,0,1],
    <br>[0,5,9,2,0,1,3,6,0],
    <br>[0,0,4,7,0,0,1,5,0],
    <br>[8,0,3,0,1,0,0,2,0],
    <br>[5,1,0,3,0,0,0,9,0]
    <br>]
  </p>
<h1>Output.</h1>
  <p>
    Finally, you should get another same format solved array, like following:
  </p>
  <p>
    [
    <br>[7,2,5,1,6,8,9,3,4],
    <br>[6,4,1,5,9,3,7,8,2],
    <br>[3,9,8,4,2,7,6,1,5],
    <br>[1,3,6,8,5,4,2,7,9],
    <br>[2,8,7,6,3,9,5,4,1],
    <br>[4,5,9,2,7,1,3,6,8],
    <br>[9,6,4,7,8,2,1,5,3],
    <br>[8,7,3,9,1,5,4,2,6],
    <br>[5,1,2,3,4,6,8,9,7]
    <br>]
  </p>
