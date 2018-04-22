/*Author = Monjura Afrin Rumi
 * This class has two properties to hold 
 * mean and standard deviation of Raffle data provided by user.
 * It also contains getter methods to be accessed from result page.
 */

package mrumi_hw5;

public class WinningResult {

	private double mean;
	private double std;
	
	public WinningResult(double m, double s)
	{		
		this.mean = m;
		this.std = s;	
	}
	
	protected double getMean()
	{
		return this.mean;
	}
	
	protected double getStd()
	{
		return this.std;
	}
	
}
