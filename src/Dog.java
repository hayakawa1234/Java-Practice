/**
 * ���K��� 7 - 1 �ȉ��� Dog �N���X���g�p���āA���̃v���O�������쐬���Ȃ����B
 *
 * Dog �N���X�̃C���X�^���X���쐬����B 
 * SetName ���\�b�h�Ŗ��O��ݒ肷��B 
 * ShowProfile ���\�b�h�Ŗ��O��\������
 */
class Dog {
	private String Name;

	public void SetName(String nm) {
		Name = nm;
	}

	public void ShowProfile() {
		System.out.println("���O�́A" + Name + "�ł��B");
	}
}

class Profile {
	Dog dog1 = new Dog();
	//dog1.SetName("mike");
}

