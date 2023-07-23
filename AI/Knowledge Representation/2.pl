% Simulate a KB for listed data sets and perform logical operations in prolog

% Data sets

% kheer contains sugar
% jeripuri contains sugar 

% namkee contains salt
% samosa contains salt 

% sweetdish is the dish which contains sugar
% salty dish is the dish which contains salt

% Logical operations

% validate kheer is a sweet dish
% listout salty dishes

% Facts for knowledge representation
contains_sugar(kheer).
contains_sugar(jeripuri).
contains_salt(namkee).
contains_salt(samosa).

% Rules for categorization
sweet_dish(Dish) :- contains_sugar(Dish).
salty_dish(Dish) :- contains_salt(Dish).
