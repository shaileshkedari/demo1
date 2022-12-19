
public class PigLatin
{
	public static void main(String[] args)
	{
		String instr="night";
		
		char out = instr.charAt(0);
		//System.out.println(out);
		
		String outstr=instr.substring(1);
		//System.out.println(outstr);
		
		outstr=outstr+out+"ay";
		System.out.println(outstr);	
	}
}