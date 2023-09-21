# Conversion of color image into gray-scale image

import cv2 
image = cv2.imread("./lab 1/img1.jpg")
cv2.imshow("real image", image)
gray_image = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
cv2.imshow("image", gray_image)
cv2.waitKey(0)
cv2.destroyAllWindows()