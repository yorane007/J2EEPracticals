
public class Btree<K,E> {

	Node root;
	Btree(){
		
	}
	static class Node<K,E>{
		K key;
		E val;
		Node(K k,E v){
			key = k;
			val = v;
		}
		
	}
}
