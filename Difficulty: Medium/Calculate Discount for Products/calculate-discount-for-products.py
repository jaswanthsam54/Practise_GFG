import pandas as pd

def calculate_discount(df: pd.DataFrame) -> pd.DataFrame:
    # Initialize the discount column with 0
    df['discount'] = 0
    
    # Define the condition: product_id is even AND category starts with 'A'
    condition = (df['product_id'] % 2 == 0) & (df['category'].str.startswith('A'))
    
    # Where condition is true, set discount to equal the price
    df.loc[condition, 'discount'] = df['price']
    
    # Sort by product_id
    result = df.sort_values(by='product_id')
    
    # Return only the required columns
    return result[['product_id', 'discount']]