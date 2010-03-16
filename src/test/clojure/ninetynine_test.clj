(ns ninetynine_test
  (:use ninetynine clojure.test))

(deftest test-mylast
  (is (= 8 (mylast '(1, 1, 2, 3, 5, 8))))
  (is (nil? (mylast ()))))

(run-tests)