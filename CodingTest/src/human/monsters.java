package human;

public class monsters {

	public static void main(String[] args) {
//		int[][] monsters = {{2,3},{4,5},{3,-3},{2,-4},{3,-6},{-3,-3},{-5,0},{-4,4}};	//	몬스터의 위치는 고정
//		int[][] bullets = {{4,1},{4,6},{1,-2},{-4,-4},{-3,0}};
		int[][] monsters = { { -4, 4 }, { -2, 2 }, { 6, 2 }, { 0, -2 } }; // 몬스터의 위치는 고정
		int[][] bullets = { { 3, 1 }, { -1, 1 }, { -1, 1 }, { 0, 4 }, { 2, -3 } };
		int answer = -1;
		int cnt = 0;

		for (int i = 0; i < bullets.length; i++) {
			//	만약 x좌표나 y좌표 중 하나가 0 이라면... monster와의 방향이 같아야겠지...
			if(bullets[i][0]==0||bullets[i][1]==0) {
				for (int j = 0; j < monsters.length; j++) {
					if(monsters[j][0]==0) {
						if(bullets[i][1]*monsters[j][1]>0||bullets[i][0]*monsters[j][0]>0) {
							cnt++;
							break;
						}
					}
				}
			}
			else {
				for (int j = 0; j < monsters.length; j++) {
					if (!(monsters[j][0] == 0 && monsters[j][1] == 0)) {
						if (bullets[i][0] * monsters[j][1] == bullets[i][1] * monsters[j][0]) {
							// 몬스터의 좌표를 (0,0)으로 바꿔준다...
							monsters[j][0] = 0;
							monsters[j][1] = 0;
							cnt++; // 맞은 몬스터 수 올려주기
							break;
						}
					}
				}
			}
			
		}
		if (cnt != 0) {
			answer = cnt;
		}
		System.out.println(answer);
	}
}
