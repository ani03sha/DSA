import unittest
from stacks import stacks_using_array as stack


class StackUsingArrayTest(unittest.TestCase):

    @classmethod
    def setUp(cls):
        stack.push(1)
        stack.push(2)
        stack.push(3)
        stack.push(4)

    def test_push(self):
        stack.push(5)
        self.assertEqual(5, stack.peek())
        stack.push(6)
        self.assertEqual(6, stack.peek())
        stack.push(7)
        self.assertEqual(7, stack.peek())
        stack.push(8)
        self.assertEqual(8, stack.peek())
        stack.push(9)
        self.assertEqual(9, stack.peek())

    def test_is_empty(self):
        self.assertEqual(False, stack.is_empty())
        stack.pop()
        self.assertEqual(False, stack.is_empty())
        stack.pop()
        self.assertEqual(False, stack.is_empty())
        stack.pop()
        self.assertEqual(False, stack.is_empty())
        stack.pop()
        self.assertEqual(True, stack.is_empty())
        stack.push(5)
        self.assertEqual(False, stack.is_empty())

    def test_pop(self):
        self.assertEqual(4, stack.pop())
        self.assertEqual(3, stack.pop())
        self.assertEqual(2, stack.pop())
        self.assertEqual(1, stack.pop())

    def test_peek(self):
        self.assertEqual(4, stack.peek())
        stack.push(5)
        self.assertEqual(5, stack.peek())
        stack.pop()
        stack.pop()
        self.assertEqual(3, stack.peek())



if __name__ == '__main__':
    unittest.main()
