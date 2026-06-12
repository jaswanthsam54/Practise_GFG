import pandas as pd

def count_product_categories(df: pd.DataFrame) -> pd.DataFrame:
    # Group by category_name and count the number of products (using 'products_count')
    result = df.groupby('category_name').size().reset_index(name='products_count')
    
    # Sort the DataFrame by category_name in ascending order
    result = result.sort_values(by='category_name', ascending=True)
    
    return result