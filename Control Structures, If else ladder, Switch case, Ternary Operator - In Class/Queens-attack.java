/* Author = Mohammad Mumtaz */
/* leetcode = mohammadmumtaz1997 */
/* GitHub Id = Mumtaz12 */
/* Language = JAVA */
/* Address = kupwara,J&k,INDIA (193225)*/

/******************************************************************************************************************************************/
/***********Start****************/
static int  QueenAttack(int X, int Y, int P, int Q)
{
if (X == P)
        return 1;
 
   
    if (Y == Q)
        return 1;
 
   
    if (Math.abs(X - P) == Math.abs(Y - Q))
        return 1;
 
    
    return 0;
}
/******************************************************************************************************************************************/
/***********End****************/
