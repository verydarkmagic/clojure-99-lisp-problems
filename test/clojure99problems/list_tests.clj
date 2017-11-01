(ns clojure99problems.core-test
    (:require [clojure.test :refer :all]
              [clojure99problems.core :refer :all]))


(deftest lists
    (defn n-element-list
        "returns an n-length list of rand-int 1000"
        [n]
        (take n (repeatedly #(rand-int 1000))))
    (def penultimate
        "http://secondforge.com/blog/2015/07/07/getting-the-penultimate-element-in-clojure/"
        (comp second reverse))
          
    (deftest test-last
        "test the my-last function"
        (let [empty (n-element-list 0)
                one (n-element-list 1)
                five (n-element-list 5)]
        (testing (is (= (my-last five) (last five))))
        (testing (is (= (my-last one) (last one))))
        (testing (is (= (my-last empty) (last empty)))))
    )
    (deftest test-before-last
        "test the before-last function"
        (let [empty (n-element-list 0)
                one (n-element-list 1)
                five (n-element-list 5)]
        (testing (is (= (before-last five) (penultimate five))))
        ;;(testing (is (= (before-last one) (penultimate one))))
        (testing (is (= (before-last empty) (penultimate empty)))))
    )
    (deftest test-kth
        "test the kth function"
        (let [empty (n-element-list 0)
                one (n-element-list 1)
                five (n-element-list 5)]
        (testing (is (= (kth five 4) (nth five 4))))
        (testing (is (= (kth one 0) (nth one 0))))
        ;;(testing (is (= (kth empty 0) (nth empty 0))))) ;;nth throws indexoutofbounds
    )
)