(ns clojure99problems.core)

(load "5")
(defn palindrome
    "6 problem"
    [coll]
    (= coll (my-reverse coll)))
    (palindrome(list 1 2 3 2 1))