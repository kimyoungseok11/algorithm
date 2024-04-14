const initArray = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8];

function selectionSort(array) {
  for (let i = 0; i < array.length; i++) {
    let minIndex = i;
    for (let j = i + 1; j < array.length; j++) {
      if (array[minIndex] > array[j]) {
        minIndex = j;
      }
    }
    [array[i], array[minIndex]] = [array[minIndex], array[i]];
  }

  console.log(array);
  return array;
}

function insertionSort(array) {
  for (let i = 0; i < array.length; i++) {
    for (let j = i; j > 0; j--) {
      if (array[j] < array[j - 1]) {
        [array[j], array[j - 1]] = [array[j - 1], array[j]];
      } else {
        break;
      }
    }
  }
  console.log(array);
  return array;
}

function quickSort(array) {}

selectionSort(initArray);
insertionSort(initArray);
