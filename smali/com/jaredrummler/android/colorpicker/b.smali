.class Lcom/jaredrummler/android/colorpicker/b;
.super Landroid/widget/BaseAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jaredrummler/android/colorpicker/b$b;,
        Lcom/jaredrummler/android/colorpicker/b$a;
    }
.end annotation


# instance fields
.field final b:Lcom/jaredrummler/android/colorpicker/b$a;

.field final c:[I

.field d:I

.field e:I


# direct methods
.method constructor <init>(Lcom/jaredrummler/android/colorpicker/b$a;[III)V
    .locals 0

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/b;->b:Lcom/jaredrummler/android/colorpicker/b$a;

    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/b;->c:[I

    iput p3, p0, Lcom/jaredrummler/android/colorpicker/b;->d:I

    iput p4, p0, Lcom/jaredrummler/android/colorpicker/b;->e:I

    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/b;->d:I

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/b;->c:[I

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/b;->c:[I

    aget p1, v0, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    if-nez p2, :cond_0

    new-instance p2, Lcom/jaredrummler/android/colorpicker/b$b;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p0, p3}, Lcom/jaredrummler/android/colorpicker/b$b;-><init>(Lcom/jaredrummler/android/colorpicker/b;Landroid/content/Context;)V

    iget-object p3, p2, Lcom/jaredrummler/android/colorpicker/b$b;->a:Landroid/view/View;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/jaredrummler/android/colorpicker/b$b;

    move-object v0, p3

    move-object p3, p2

    move-object p2, v0

    :goto_0
    invoke-virtual {p2, p1}, Lcom/jaredrummler/android/colorpicker/b$b;->c(I)V

    return-object p3
.end method
