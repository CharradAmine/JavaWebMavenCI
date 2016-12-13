
package ejb;

import javax.ejb.Local;

/**
 *
 * @author amine
 */
@Local
public interface CalcEJBLocal {
    public int addition(int a, int b);
}
