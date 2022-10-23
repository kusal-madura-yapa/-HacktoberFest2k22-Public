#check
class Node:
	def __init__(self, ky1):
		self.left = None
		self.right = None
		self.val = ky1
def prntInumorder(rt):
	if rt:
		prntInumorder(rt.left)
		print(rt.val),
		prntInumorder(rt.right)
rt = Node(1)
rt.left = Node(2)
rt.right = Node(3)
rt.left.left = Node(4)
rt.left.right = Node(5)
# its not working
print("\nInorder traversal of binary tree is")
prntInumorder(rt)
