.class Lcom/digdroid/alman/dig/r$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/r;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r$d;->c:Lcom/digdroid/alman/dig/r;

    iput p2, p0, Lcom/digdroid/alman/dig/r$d;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/r$d;->c:Lcom/digdroid/alman/dig/r;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r;->a(Lcom/digdroid/alman/dig/r;)Lcom/digdroid/alman/dig/s3;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r$d;->c:Lcom/digdroid/alman/dig/r;

    iget-object v2, v1, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    iget v3, p0, Lcom/digdroid/alman/dig/r$d;->b:I

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/n;->p(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
