.class Lcom/digdroid/alman/dig/y3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/y3;->c1(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/y3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/y3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y3$a;->b:Lcom/digdroid/alman/dig/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/y3$a;->b:Lcom/digdroid/alman/dig/y3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y3;->Z0(Lcom/digdroid/alman/dig/y3;)Lcom/digdroid/alman/dig/w3;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/y3$a;->b:Lcom/digdroid/alman/dig/y3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y3;->Z0(Lcom/digdroid/alman/dig/y3;)Lcom/digdroid/alman/dig/w3;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/w3;->q2(Z)V

    :cond_0
    return-void
.end method
