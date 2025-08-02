package homework9.task5;


import java.lang.reflect.Field;

/**
 * This class provides a method to find the object with the highest value of a specified integer field
 * from an array of objects.
 */
public class HighestValue {
    /**
     * Finds the object with the highest value of the specified integer field from the given array.
     *
     * @param array    an array of objects to search through
     * @param criterion the name of the field to compare
     * @return the object with the highest value of the specified field, or null if the array is empty
     * @throws IllegalAccessException if the field cannot be accessed
     */
    public static Object getHighestByValue(Object[] array, String criterion) throws IllegalAccessException {
        if (array == null || array.length == 0) {
            return null;
        }

        Object maxObj = array[0];
        int maxValue = getIntFieldValue(maxObj, criterion);
        for (int i = 1; i < array.length; i++) {
            int currentValue = getIntFieldValue(array[i], criterion);
            if (currentValue > maxValue) {
                maxValue = currentValue;
                maxObj = array[i];
            }
        }

        return maxObj;

    }
    /**
     * Retrieves the integer value of a specified field from an object.
     *
     * @param obj       the object from which to retrieve the field value
     * @param criterion the name of the field to retrieve
     * @return the integer value of the specified field
     * @throws IllegalAccessException if the field cannot be accessed
     */
    private static int getIntFieldValue(Object obj, String criterion) throws IllegalAccessException {

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().equals(criterion)) {
                field.setAccessible(true);
                return field.getInt(obj);

            }
        }
        throw new IllegalArgumentException("Field " + criterion + " not found in class " + obj.getClass().getName());

    }


}
