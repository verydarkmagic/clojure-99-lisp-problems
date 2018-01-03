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
            (testing (is (= (my-last empty) (last empty))))
        )
    )
    (deftest test-before-last
        "test the before-last function"
        (let [empty (n-element-list 0)
                one (n-element-list 1)
                five (n-element-list 5)]
            (testing (is (= (before-last five) (penultimate five))))
            (testing (is (= (before-last empty) (penultimate empty))))
        )
    )
    (deftest test-kth
        "test the kth function"
        (let [empty (n-element-list 0)
                one (n-element-list 1)
                five (n-element-list 5)]
            (testing (is (= (kth five 4) (nth five 4))))
            (testing (is (= (kth one 0) (nth one 0))))
        )
        ;;(testing (is (= (kth empty 0) (nth empty 0))))) ;;nth throws indexoutofbounds
    )
    (deftest test-my-count
        "test the my-count function"
        (let [empty (n-element-list 0)
                one (n-element-list 1)
                five (n-element-list 5)]
            (testing (is (= (my-count five) (count five))))
            (testing (is (= (my-count one) (count one))))
            (testing (is (= (my-count empty) (count empty))))
        )
    )
    (deftest test-my-reverse
        "test the my-count function"
        (let [empty (n-element-list 0)
                one (n-element-list 1)
                five (n-element-list 5)]
            (testing (is (= (my-reverse five) (reverse five))))
            (testing (is (= (my-reverse one) (reverse one))))
            (testing (is (= (my-reverse empty) (reverse empty))))
        )
    )
    (deftest test-palindrome
        "test the palindrome"
        (testing (is (= true (palindrome (list 1 2 3 2 1)))))
        (testing (is (= false (palindrome (list 1 2 3 2 2)))))
    )
    (deftest test-flatten
        "test my-flatten function"
        (let [foo (list 1 2 (list 4 5 (list 1)))
              bar (list 1 2 4 5 1)]
            (testing (is (= (my-flatten foo) (flatten foo))))
            (testing (is (= (my-flatten foo) (flatten bar))))
        )
    )
    (deftest test-compress
        "test compress function"
        (testing (is (= (compress (list 1 1 1 2 3 4 4 4 5 5 6 6 6)) (list 1 2 3 4 5 6))))
        (testing (is (= (compress (list 12 12 1 3 12 12)) (list 12 1 3 12))))
    )
)