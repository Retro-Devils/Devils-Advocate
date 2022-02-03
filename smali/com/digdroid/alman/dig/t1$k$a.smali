.class Lcom/digdroid/alman/dig/t1$k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1$k;->onPreExecute()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/t1$k;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1$k;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$k$a;->b:Lcom/digdroid/alman/dig/t1$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$k$a;->b:Lcom/digdroid/alman/dig/t1$k;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->cancel(Z)Z

    return-void
.end method
