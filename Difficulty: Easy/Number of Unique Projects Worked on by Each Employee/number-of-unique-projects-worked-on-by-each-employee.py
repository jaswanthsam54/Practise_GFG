import pandas as pd

def count_unique_projects(df: pd.DataFrame) -> pd.DataFrame:
    # Group by employee_id, find unique project counts, and reset index directly
    result = df.groupby('employee_id')['project_id'].nunique().reset_index()
    
    # Assign the correct column names cleanly without using inplace=True
    result.columns = ['employee_id', 'cnt']
    
    return result