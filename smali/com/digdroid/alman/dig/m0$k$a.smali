.class Lcom/digdroid/alman/dig/m0$k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0$k;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[J

.field final synthetic c:Lcom/digdroid/alman/dig/m0$k;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0$k;[J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$k$a;->c:Lcom/digdroid/alman/dig/m0$k;

    iput-object p2, p0, Lcom/digdroid/alman/dig/m0$k$a;->b:[J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$k$a;->c:Lcom/digdroid/alman/dig/m0$k;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$k;->a:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$k$a;->b:[J

    aget-wide v1, v0, p2

    new-instance p2, Lcom/digdroid/alman/dig/m0$k$a$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/m0$k$a$a;-><init>(Lcom/digdroid/alman/dig/m0$k$a;)V

    invoke-static {p1, v1, v2, p2}, Lcom/digdroid/alman/dig/m0;->b(Landroid/app/Activity;JLcom/digdroid/alman/dig/m0$o;)V

    return-void
.end method
