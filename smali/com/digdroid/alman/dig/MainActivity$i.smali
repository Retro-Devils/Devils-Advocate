.class Lcom/digdroid/alman/dig/MainActivity$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MainActivity;->b3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/MainActivity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$i;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$i;->b:Lcom/digdroid/alman/dig/MainActivity;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string p2, "auto_scan"

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    new-instance p1, Lcom/digdroid/alman/dig/a3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/MainActivity$i;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p1, p2}, Lcom/digdroid/alman/dig/a3;-><init>(Landroid/app/Activity;)V

    new-instance p2, Lcom/digdroid/alman/dig/MainActivity$i$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/MainActivity$i$a;-><init>(Lcom/digdroid/alman/dig/MainActivity$i;)V

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/a3;->a(Lcom/digdroid/alman/dig/a3$b;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$i;->b:Lcom/digdroid/alman/dig/MainActivity;

    iput-boolean v0, p1, Lcom/digdroid/alman/dig/MainActivity;->u1:Z

    return-void
.end method
