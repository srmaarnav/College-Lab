# image negative

import cv2 

img = cv2.imread('./lab 2/img1.jpg')

cv2.imshow('Input Image', img)

img_neg = 1 - img

cv2.imshow('Output Image', img_neg)
cv2.waitKey(0)

cv2.destroyAllWindows()