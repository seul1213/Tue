package chap01;


//�̼� 1: �־��� ���� �µ��� ȭ�� �µ��� �ٲٴ� CtoF �޼ҵ带 �ۼ��϶�.
//	F = (9/5)*C + 32
//C : 15�� ��� ����
// input - intC (����) / output - F == (9/5)*C+32
// int + double = ū ���� ���缭 ���´�. 5 -> 5.0 ���� 
// ���� 5 / �Ǽ� 5.
public class Mission1 {
	public static double CtoF( int C) {
		return (9./5.)*C +32;
	}
	
	public static void main(String[] args) {
		int C =14;
		
		System.out.println("ȭ���µ� : " + CtoF(C));
		}
	
	}

