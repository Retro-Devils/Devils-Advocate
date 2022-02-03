.class Lcom/jaredrummler/android/colorpicker/b$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/b$b;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/jaredrummler/android/colorpicker/b$b;


# direct methods
.method constructor <init>(Lcom/jaredrummler/android/colorpicker/b$b;I)V
    .locals 0

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b$a;->c:Lcom/jaredrummler/android/colorpicker/b$b;

    iput p2, p0, Lcom/jaredrummler/android/colorpicker/b$b$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b$a;->c:Lcom/jaredrummler/android/colorpicker/b$b;

    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/b$b;->e:Lcom/jaredrummler/android/colorpicker/b;

    iget v0, p1, Lcom/jaredrummler/android/colorpicker/b;->d:I

    iget v1, p0, Lcom/jaredrummler/android/colorpicker/b$b$a;->b:I

    if-eq v0, v1, :cond_0

    iput v1, p1, Lcom/jaredrummler/android/colorpicker/b;->d:I

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_0
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b$a;->c:Lcom/jaredrummler/android/colorpicker/b$b;

    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/b$b;->e:Lcom/jaredrummler/android/colorpicker/b;

    iget-object v0, p1, Lcom/jaredrummler/android/colorpicker/b;->b:Lcom/jaredrummler/android/colorpicker/b$a;

    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/b;->c:[I

    iget v1, p0, Lcom/jaredrummler/android/colorpicker/b$b$a;->b:I

    aget p1, p1, v1

    invoke-interface {v0, p1}, Lcom/jaredrummler/android/colorpicker/b$a;->a(I)V

    return-void
.end method
