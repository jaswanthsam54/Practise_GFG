import pandas as pd

def find_eco_low_calorie_products(df: pd.DataFrame) -> pd.DataFrame:
    # Adding .copy() creates a clean, independent DataFrame 
    # and prevents the platform's backend from throwing a Runtime Error
    result = df[(df['eco_friendly'] == 'Y') & (df['calories'] <= 200)][['product_id', 'product_name', 'calories']].copy()
    
    return result