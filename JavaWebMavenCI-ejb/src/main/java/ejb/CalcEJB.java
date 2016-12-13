
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author amine
 */
@Stateless
public class CalcEJB implements CalcEJBLocal {

    @Override
    public int addition(int a, int b) {
        return a+b;
    }

    
}
