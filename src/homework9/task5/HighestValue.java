package homework9.task5;


import java.lang.reflect.Field;

public class HighestValue {
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
