(ns ninetynine_test
  (:use ninetynine clojure.test))

(deftest test-mylast
  (defn exec-last [f]
    (is (= 8 (f '(1, 1, 2, 3, 5, 8))))
    (is (nil? (f ()))))
  (exec-last mylast)
  (exec-last mylast2))

(deftest test-penultimate
  (defn exec [f]
    (is (= 5 (f '(1, 1, 2, 3, 5, 8))))
    (is (nil? (f ()))))
  (exec penultimate)
  (exec penultimate2))

(deftest test-mylength
  (is (= 6 (mylength '(1, 1, 2, 3, 5, 8))))
  (is (= 0 (mylength '()))))

(run-tests)