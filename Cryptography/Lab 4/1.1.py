## MD4 implementation using python

from Crypto.Hash import MD4

text = 'Hello There'
hashObject = MD4.new(text.encode('utf-8'))
digest = hashObject.hexdigest()

print("The hexadecimal equivalent of hash using MD4 is : ", end ="")
print(digest)