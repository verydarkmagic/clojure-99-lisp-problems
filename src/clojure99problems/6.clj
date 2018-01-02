(ns clojure99problems.core)

(load "5")
(defn palindrome
    "6 problem"
    [coll]
    (= coll (my-reverse coll)))